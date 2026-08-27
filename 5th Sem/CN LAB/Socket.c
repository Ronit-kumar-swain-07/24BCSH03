#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Socket {
	char socket_id[10];
	char socket_type[10];
	char host_id[10];
	char dest_id[10];
	int port_no;
};
struct Socket s;
void set_socket()
{
printf("Enter the Socket Id : ");
scanf("%s",s.socket_id);
printf("Enter the Socket Type : ");
scanf("%s",s.socket_type);
printf("Enter the Host Id : ");
scanf("%s",s.host_id);
printf("Enter the Destination Id : ");
scanf("%s",s.dest_id);
printf("Enter the Port No. : ");
scanf("%d",&s.port_no);
}

void get_socket() 
{
printf("\n Socket Details : \n");
printf("ID : %s \n", s.socket_id);
printf("Type : %s \n", s.socket_type);
printf("Host Id : %s \n", s.host_id);
printf("Destination Id : %s \n", s.dest_id);
printf("Port No. : %d \n", s.port_no);
}

int main() 
{
set_socket();
get_socket();
return 0;
}
