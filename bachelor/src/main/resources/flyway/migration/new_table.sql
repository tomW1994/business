-- Table: public.student

-- DROP TABLE public.student;

CREATE TABLE public.student
(
    name character varying(255) COLLATE pg_catalog."default",
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    alter integer,
    vorname character varying COLLATE pg_catalog."default",
    CONSTRAINT student_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.student
    OWNER to postgres;