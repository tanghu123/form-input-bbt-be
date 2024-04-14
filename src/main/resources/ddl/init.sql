CREATE TABLE public."user" (
	id varchar NOT NULL,
	"name" varchar NULL,
	login_name varchar NOT NULL,
	email varchar NULL,
	"password" varchar NOT NULL,
	phone varchar NULL,
	created timestamp NOT NULL,
	last_modified timestamp NOT NULL,
	tenant_id varchar NOT NULL,
	created_user varchar NOT NULL,
	last_modified_user varchar NOT NULL,
	"version" int4 NULL
);