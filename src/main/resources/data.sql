-- DESTINOS
INSERT INTO destino (cidade, estado, pais, descricao) VALUES
('Rio de Janeiro', 'RJ', 'Brasil', 'Praias icônicas, Pão de Açúcar, Cristo Redentor e passeios culturais pela Cidade Maravilhosa.'),
('Ipatinga', 'MG', 'Brasil', 'Natureza exuberante no Vale do Aço, Parque Ipanema, gastronomia mineira e trilhas ecológicas.'),
('Cancún', 'Quintana Roo', 'México', 'Mar azul-turquesa do Caribe, resorts all-inclusive, cenotes sagrados e ruínas maias.'),
('Gramado', 'RS', 'Brasil', 'Charme europeu na Serra Gaúcha, Lago Negro, fondue, chocolates artesanais e clima acolhedor.'),
('Fernando de Noronha', 'PE', 'Brasil', 'Santuário ecológico com águas cristalinas, Baía do Sancho e mergulho com vida marinha.'),
('Salvador', 'BA', 'Brasil', 'História viva no Pelourinho, Elevador Lacerda, pôr do sol na Baía de Todos-os-Santos e axé.'),
('Banff', 'Alberta', 'Canadá', 'Paisagens alpinas nas Montanhas Rochosas, águas azul-turquesa do Lago Louise, trilhas ecológicas e passeios de gôndola panorâmica.');

-- PASSAGEIROS
INSERT INTO passageiro (nome, cpf, email, telefone) VALUES
('Mariana Costa Almeida', '111.444.777-35', 'mariana.almeida@email.com', '(61) 99123-4501'),
('Lucas Henrique Ferreira', '529.982.247-25', 'lucas.ferreira@email.com', '(11) 98234-5602'),
('Camila Rocha Mendes', '348.291.056-15', 'camila.mendes@email.com', '(21) 99345-6703'),
('Rafael Augusto Nogueira', '714.582.930-43', 'rafael.nogueira@email.com', '(31) 98456-7804'),
('Beatriz Oliveira Santos', '862.409.173-03', 'beatriz.santos@email.com', '(71) 99567-8905'),
('Gabriel Martins Ribeiro', '490.318.625-33', 'gabriel.ribeiro@email.com', '(51) 98678-9006'),
('Juliana Pereira Lima', '257.194.806-76', 'juliana.lima@email.com', '(81) 99789-0107'),
('Thiago Carvalho Sousa', '935.620.418-70', 'thiago.sousa@email.com', '(62) 98890-1208'),
('Fernanda Dias Monteiro', '608.743.291-40', 'fernanda.monteiro@email.com', '(41) 99901-2309'),
('Pedro Vinícius Barbosa', '173.859.042-97', 'pedro.barbosa@email.com', '(85) 98012-3410');

-- VIAGENS
INSERT INTO viagem (data_ida, data_volta, valor, status, passageiro_id, destino_id) VALUES
('2026-12-10', '2026-12-14', 1450.00, 'CONFIRMADA', (SELECT id FROM passageiro WHERE cpf = '111.444.777-35'), (SELECT id FROM destino WHERE cidade = 'Rio de Janeiro')),
('2027-01-12', '2027-01-18', 9490.00, 'CONFIRMADA', (SELECT id FROM passageiro WHERE cpf = '529.982.247-25'), (SELECT id FROM destino WHERE cidade = 'Banff')),
('2027-02-05', '2027-02-10', 6490.00, 'PENDENTE',   (SELECT id FROM passageiro WHERE cpf = '348.291.056-15'), (SELECT id FROM destino WHERE cidade = 'Cancún')),
('2026-12-18', '2026-12-22', 2190.00, 'CONFIRMADA', (SELECT id FROM passageiro WHERE cpf = '714.582.930-43'), (SELECT id FROM destino WHERE cidade = 'Gramado')),
('2027-01-20', '2027-01-24', 4890.00, 'PENDENTE',   (SELECT id FROM passageiro WHERE cpf = '862.409.173-03'), (SELECT id FROM destino WHERE cidade = 'Fernando de Noronha'));