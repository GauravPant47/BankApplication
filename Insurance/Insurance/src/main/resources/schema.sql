drop table if exists `insurance`;

create table `insurance`(
`insurance_number` int auto_increment primary key,
`customer_id` int not null,
`insurance_type` varchar(255) not null,
`insurance_amount` long not null,
`insurance_end_date` date default +1
);