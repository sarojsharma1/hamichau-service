create table uploaded_file_info
(
    file_id          number(19, 0) generated as identity,
    content_type     varchar2(255 char),
    file_name        varchar2(255 char) not null,
    file_size        number(19, 0),
    file_upload_date timestamp(6),
    primary key (file_id)
)
