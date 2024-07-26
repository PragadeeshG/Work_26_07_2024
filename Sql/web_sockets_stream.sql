create table if not exists web_sockets_stream(
streaming_code varchar(255) not null,
streaming_name varchar(255) null,
streaming_type varchar(255) null,
web_socket_message_broker varchar(255) null,
web_socket_config varchar(255) null,
abstract_web_socket_message_broker_configurer varchar(255) null,
configure_message_broker varchar(255) null,
enable_simple_broker varchar(255) null,
application_destination_prefixes varchar(255) null,
register_stomp_endpoints varchar(255) null,
constraint web_sockets_stream_pk primary key(streaming_code));