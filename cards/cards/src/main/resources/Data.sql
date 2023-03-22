DROP TABLE IF EXISTS cards;

CREATE TABLE `cards` (
`card_id` INT AUTO_INCREMENT PRIMARY KEY,
`customer_id` INT NOT NULL,
`card_num` INT NOT NULL,
`card_type` VARCHAR(100) NOT NULL,
`expir_date` DATE DEFAULT NULL
);

INSERT INTO `cards`(`customer_id`,`card_num`,`card_type`,`expir_date`)
VALUES(1,7589,'david',CURDATE());

INSERT INTO `cards`(`customer_id`,`card_num`,`card_type`,`expir_date`)
VALUES(1,2564,'card',CURDATE());

INSERT INTO `cards`(`customer_id`,`card_num`,`card_type`,`expir_date`)
VALUES(2,2635,'card',CURDATE());

INSERT INTO `cards`(`customer_id`,`card_num`,`card_type`,`expir_date`)
VALUES(2,7589,'david',CURDATE());
