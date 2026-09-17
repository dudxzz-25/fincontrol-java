# FinControl Java

Sistema bancário de terminal escrito em **Java**, aplicando orientação a objetos, encapsulamento, herança, polimorfismo, exceções e persistência em CSV.

## Compilar e executar
Linux/macOS:
```bash
./build.sh
java -cp out com.eduardo.fincontrol.Main
```
Windows (PowerShell):
```powershell
javac -d out src/com/eduardo/fincontrol/*.java
java -cp out com.eduardo.fincontrol.Main
```

Os dados são persistidos em `data/accounts.csv`. `sql/schema.sql` apresenta uma modelagem relacional equivalente para evolução futura.
