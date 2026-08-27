#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>
#include<sys/types.h>
#include <winsock2.h>
#include <ws2tcpip.h>
void error(char *msg)
{
	perror(msg);
	exit(1);
}

int main(int argc, char*argv[])
{
	int newsockfd,sockfd, portno, clilen;
	char buffer[256];
	struct sockaddr_in serv_addr, cli_addr;
	int n;
	if (argc < 2) 
	{
		fprintf(stderr,"ERROR, no port provided.\n");
		exit(1);
	}
	sockfd = socket(AF_INET, SOCK_STREAM, 0);
	if (sockfd < 0) 
	{
		error("ERROR Opening Socket.");
	}
	bzero((char*)&serv_addr, sizeof(serv_addr));
	portno = atoi(argv[1]);
	serv_addr.sin_family = AF_INET;
	serv_addr.sin_addr.s_addr = INADDR_ANY;
	serv_addr.sin_port = htons(portno);
	if(bind(sockfd,(struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0)
	{
		error("ERROR on Binding.");
	}
	listen(sockfd,5);
	clilen = sizeof(cli_addr);
	newsockfd = accept(sockfd,(struct sockaddr *)&cli_addr, &clilen);
	while(1)
	{
		if (newsockfd < 0) 
		{
			error("ERROR on Accept.");
		}
		bzero(buffer,256);
		n = read(newsockfd, buffer, 255);
		if(n == 4 && buffer[0] == 'B' && buffer[1] == 'Y' && buffer[2] == 'E')
		{
			exit(0);
		}
		if (n < 0)
		{
			error("ERROR reading from Socket.");
		}
		printf("Message: %s\n", buffer);
		printf("Enter Your Message: ");
		bzero(buffer,256);
		fgets(buffer,256,stdin);
		n = write(newsockfd, buffer, strlen(buffer));
		if(n == 4 && buffer[0] == 'B' && buffer[1] == 'Y' && buffer[2] == 'E')
		{
			exit(0);
		}
		if (n < 0)
		{
			error("ERROR Writing to Socket.");
		}
	}
	return 0;	
}
