  create table topicos (

      id bigint not null auto_increment,
      titulo varchar(250) not null unique,
      mensaje varchar(250) not null unique,
      fecha_Creacion datetime not null,
      status tinyint,
      autor varchar(250) not null,
      curso varchar(250) not null,
      respuestas varchar(250),
      primary key (id)
  );