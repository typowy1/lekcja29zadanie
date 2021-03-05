INSERT INTO user(id, username, password)
VALUES (1, 'admin', '{noop}kkkk'),
       (2, 'Rafal', '{noop}kkkk'),
       (3, 'Piotr', '{noop}kkkk');

INSERT INTO user_role(user_id, role)
VALUES (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER'),
       (3, 'ROLE_USER');
