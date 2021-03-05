INSERT INTO user(id, username, password)
VALUES (1, 'admin', '{noop}kkkk'), (2, 'Rafal', '{noop}kkkk'), (3, 'Piotr', '{noop}kkkk');

INSERT INTO user_role(user_id, role)
VALUES (1, 'ADMIN'), (1, 'USER'), (2, 'USER'), (3, 'USER');
