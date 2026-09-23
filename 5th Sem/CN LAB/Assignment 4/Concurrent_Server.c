#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netdb.h>
#include<signal.h>
#include<netinet/in.h>
#include<unistd.h>
#include<string.h>
#include<arpa/inet.h>
#define TRUE 1

int main()
{
	int soc, chpid, msgsock;
	socklen_t len;
	char buff[1024], buff1[1024];
	struct sockaddr_in server, client;
	socklen_t addrlen = sizeof(client);
	
	soc = socket(AF_INET, SOCK_STREAM, 0);
	
	if(soc < 0)
	{
		perror("ERROR opening socket.");
		exit(1);
	}
	
	server.sin_family = AF_INET;
	
	server.sin_addr.s_addr = inet_addr("192.168.21.156");	
	
	server.sin_port = 0;
	
	if(bind(soc, (struct sockaddr *)&server, sizeof(server)) < 0)
	{
		perror("\nError on Binding.");
		exit(1);
	}
	
	len = sizeof(server);
	if(getsockname(soc, (struct sockaddr *)&server, &len))
	{
		perror("\nError in Getting Port..");
		exit(3);
	}
	printf("\nSocket has port no. : %hd\n", htons(server.sin_port));
	listen(soc,5);
	signal(SIGCHLD,SIG_IGN);
	do
	{
		msgsock = accept(soc, (struct sockaddr *)&client, (socklen_t*)&addrlen);
		if(msgsock == -1)
		{
			perror("\n Error in Accept...");
			exit(0);
		}
		else
		{
			if((chpid=fork()) == 0)
			{
				close(soc);
				do
				{
					read(msgsock, buff, 1024);
					printf("\n Message from Client: %s\n", buff);
					printf("\nMessage to Client: ");
					scanf(" %[^\n]", buff1);
					write(msgsock, buff1, 1024);
				}while(strcmp(buff1, "BYE") != 0);
				close(msgsock);
				exit(0);
			}
			else
			{
				close(msgsock);
			}	
		}
	}while(TRUE);
	close(soc);
	return 0;
}
