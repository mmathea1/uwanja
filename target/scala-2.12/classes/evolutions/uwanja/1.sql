# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table attendance (
  id                            varchar(255) not null,
  attendance_date               datetime(6),
  attended                      tinyint(1),
  constraint pk_attendance primary key (id)
);

create table classroom (
  id                            varchar(255) not null,
  classroom_name                varchar(255),
  first_year                    integer,
  constraint pk_classroom primary key (id)
);

create table family (
  id                            varchar(255) not null,
  family_name                   varchar(255),
  family_type                   varchar(255),
  constraint pk_family primary key (id)
);

create table guardian (
  id                            varchar(255) not null,
  fname                         varchar(255),
  lname                         varchar(255),
  email                         varchar(255),
  phone_number                  varchar(255),
  constraint pk_guardian primary key (id)
);

create table homework_assignment (
  id                            varchar(255) not null,
  extra_notes                   varchar(255),
  submission_date               datetime(6),
  constraint pk_homework_assignment primary key (id)
);

create table sport (
  id                            varchar(255) not null,
  sport_type                    varchar(255),
  constraint pk_sport primary key (id)
);

create table sports_team (
  id                            varchar(255) not null,
  team_name                     varchar(255),
  constraint pk_sports_team primary key (id)
);

create table student (
  id                            varchar(255) not null,
  fname                         varchar(255),
  lname                         varchar(255),
  dob                           datetime(6),
  constraint pk_student primary key (id)
);

create table subject_ref (
  id                            varchar(255) not null,
  subject_code                  varchar(255),
  subject_name                  varchar(255),
  constraint pk_subject_ref primary key (id)
);

create table teacher (
  id                            varchar(255) not null,
  fname                         varchar(255),
  lname                         varchar(255),
  email                         varchar(255),
  phone_number                  varchar(255),
  year_joined                   integer,
  constraint pk_teacher primary key (id)
);


# --- !Downs

drop table if exists attendance;

drop table if exists classroom;

drop table if exists family;

drop table if exists guardian;

drop table if exists homework_assignment;

drop table if exists sport;

drop table if exists sports_team;

drop table if exists student;

drop table if exists subject_ref;

drop table if exists teacher;

