create database if not exists areasDeRisco;
use areasDeRisco;

LOAD DATA LOCAL INFILE 'C:\\Users\\B_89\\Desktop\\final_web\\sedecchamados.csv' INTO TABLE tb_registro
CHARACTER SET utf8
fields terminated by ';' 
lines terminated by '\r'
;