CREATE TABLE accounts (
  account_number INTEGER PRIMARY KEY,
  holder VARCHAR(120) NOT NULL,
  account_type VARCHAR(20) NOT NULL CHECK(account_type IN ('CORRENTE','POUPANCA')),
  balance DECIMAL(14,2) NOT NULL DEFAULT 0
);
CREATE TABLE transactions (
  transaction_id INTEGER PRIMARY KEY,
  account_number INTEGER NOT NULL REFERENCES accounts(account_number),
  transaction_type VARCHAR(20) NOT NULL,
  amount DECIMAL(14,2) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
