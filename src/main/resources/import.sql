INSERT INTO photos (title, description, url, visible) VALUES ( 'Paesaggio' , 'descrizione paesaggio' , 'https://i0.wp.com/viaggiosoloandata.it/wp-content/uploads/2021/03/Immagine-copertina-per-blog-1-2.jpg?fit=770%2C510&ssl=1' , true );
INSERT INTO photos (title, description, url, visible) VALUES ( 'Animale' , 'descrizione animale' , 'https://www.amoreaquattrozampe.it/wp-content/uploads/2020/05/pellicano-1.jpg' , true );
INSERT INTO photos (title, description, url, visible) VALUES ( 'Palazzo' , 'descrizione palazzo' , 'https://visitsabbioneta.ams3.digitaloceanspaces.com/visitsabbioneta/__sized__/images/Palazzo_Ducale_-_esterno-thumbnail-2000x1200-100.jpg' , true );
INSERT INTO photos (title, description, url, visible) VALUES ( 'Persona' , 'descrizione persona' , 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/pitti-street-style-gennaio-2020-3-1578654755.jpg?crop=0.870xw:0.914xh;0.0121xw,0.0533xh&resize=480:*' , true );

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

INSERT INTO messages(created_at, mail, text) VALUES ('2023-04-17 13:00:00','alberto@gmail.com','bello')
INSERT INTO messages(created_at, mail, text) VALUES ('2022-04-18 14:00:00','alessandro@gmail.com','wow')
INSERT INTO messages(created_at, mail, text) VALUES ('2023-04-19 15:00:00','pippo@gmail.com','interessante')