INSERT INTO photos (title, description, url, visible) VALUES ( 'Paesaggio' , 'descrizione paesaggio' , 'aaa' , true );
INSERT INTO photos (title, description, url, visible) VALUES ( 'Animale' , 'descrizione animale' , 'bbb' , true );
INSERT INTO photos (title, description, url, visible) VALUES ( 'Palazzo' , 'descrizione palazzo' , 'ccc' , true );
INSERT INTO photos (title, description, url, visible) VALUES ( 'Persona' , 'descrizione persona' , 'ddd' , true );

INSERT INTO category(name) VALUES ( 'Paesaggi' );
INSERT INTO category(name) VALUES ( 'Animali' );
INSERT INTO category(name) VALUES ( 'Edifici' );
INSERT INTO category(name) VALUES ( 'Persone' );

INSERT INTO photo_category(photo_id, category_id) VALUES (1,1)
INSERT INTO photo_category(photo_id, category_id) VALUES (2,2)
INSERT INTO photo_category(photo_id, category_id) VALUES (3,3)
INSERT INTO photo_category(photo_id, category_id) VALUES (4,4)

INSERT INTO users (email, first_name, last_name, password) VALUES('john@email.it', 'John', 'Doe', '{noop}john');
INSERT INTO users (email, first_name, last_name, password) VALUES('jane@email.it', 'Jane', 'Smith','{noop}jane');

INSERT INTO roles (id, name) VALUES(1, 'ADMIN');
INSERT INTO roles (id, name) VALUES(2, 'USER');

INSERT into users_roles(user_id, roles_id) VALUES(1, 1);
INSERT into users_roles(user_id, roles_id) VALUES(2, 2);