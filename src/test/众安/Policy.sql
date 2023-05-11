-- 创建 Party 表，存储当事人信息
CREATE TABLE Party (
  id LONG NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  gender ENUM('MALE', 'FEMALE') NOT NULL,
  date_of_birth DATE NOT NULL,
  address VARCHAR(100) NOT NULL,
  phone VARCHAR(11) NOT NULL,
  PRIMARY KEY (id)
);

-- 创建 InsuredObject 表，存储被保险标的信息
CREATE TABLE InsuredObject (
  id LONG NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(100) NOT NULL,
  sum_insured DECIMAL(10, 2) NOT NULL,
  PRIMARY KEY (id)
);

-- 创建 Liability 表，存储保险责任信息
CREATE TABLE Liability (
  id LONG NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  sum_insured DECIMAL(10, 2) NOT NULL,
  PRIMARY KEY (id)
);

-- 创建 Product 表，存储保险产品信息
CREATE TABLE Product (
  id LONG NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(1000) NOT NULL,
  premium DECIMAL(10, 2) NOT NULL,
  payment_frequency ENUM('ANNUALLY', 'SEMI_ANNUALLY', 'QUARTERLY', 'MONTHLY') NOT NULL,
  PRIMARY KEY (id)
);

-- 创建 ProductLiability 表，存储产品和责任的关系
CREATE TABLE ProductLiability (
  product_id LONG NOT NULL,
  liability_id LONG NOT NULL,
  PRIMARY KEY (product_id, liability_id),
  FOREIGN KEY (product_id) REFERENCES Product(id),
  FOREIGN KEY (liability_id) REFERENCES Liability(id)
);

-- 创建 Policy 表，存储保单信息
CREATE TABLE Policy (
  id LONG NOT NULL AUTO_INCREMENT,
  status ENUM('ACTIVE', 'CANCELLED', 'EXPIRED') NOT NULL,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL,
  PRIMARY KEY (id)
);

-- 创建 PolicyParty 表，存储保单和当事人的关系
CREATE TABLE PolicyParty (
  policy_id LONG NOT NULL,
  party_id LONG NOT NULL,
  PRIMARY KEY (policy_id, party_id),
  FOREIGN KEY (policy_id) REFERENCES Policy(id),
  FOREIGN KEY (party_id) REFERENCES Party(id)
);

-- 创建 PolicyInsuredObject 表，存储保单和被保险标的的关系
CREATE TABLE PolicyInsuredObject (
    policy_id LONG NOT NULL,
    insured_object_id LONG NOT NULL,
    PRIMARY KEY (policy_id, insured_object_id),
    FOREIGN KEY (policy_id) REFERENCES Policy (id),
    FOREIGN KEY (insured_object_id) REFERENCES InsuredObject (id)
);

-- 创建 PolicyProduct 表，存储保单和保险产品的关系
CREATE TABLE PolicyProduct (
    policy_id LONG NOT NULL,
    product_id LONG NOT NULL,
    PRIMARY KEY (policy_id, product_id),
    FOREIGN KEY (policy_id) REFERENCES Policy (id),
    FOREIGN KEY (product_id) REFERENCES Product (id)
);
-- 创建 PolicyLiability 表，存储保单和责任的关系
CREATE TABLE PolicyLiability (
    policy_id LONG NOT NULL,
    Liability_id LONG NOT NULL,
    PRIMARY KEY (policy_id, Liability_id),
    FOREIGN KEY (policy_id) REFERENCES Policy (id),
    FOREIGN KEY (Liability_id) REFERENCES Liability (id)
);

SELECT p.id, p.start_date, p.end_date
FROM Policy p
INNER JOIN PolicyLiability pl ON p.id = pl.policy_id
INNER JOIN Liability l ON pl.liability_id = l.id
WHERE l.id = ?
GROUP BY l.id
ORDER BY l.id DESC;

SELECT p.id, p.status, p.start_date, p.end_date, l.id
FROM policy p
JOIN product pr ON p.id = pr.id
JOIN ProductLiability pl ON pr.id = pl.product_id
JOIN liability l ON pl.liability_id = l.id
WHERE l.id = 'your_code'
GROUP BY l.id
ORDER BY l.id DESC;

