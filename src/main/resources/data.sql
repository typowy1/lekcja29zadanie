INSERT INTO user(id, username, password)
VALUES (1, 'admin', '{noop}asdf'), (2, 'Rafal', '{noop}asdf'), (3, 'Piotr', '{noop}asdf');

INSERT INTO user_role(user_id, role)
VALUES (1, 'ADMIN'), (1, 'USER'), (2, 'USER'), (3, 'USER');
