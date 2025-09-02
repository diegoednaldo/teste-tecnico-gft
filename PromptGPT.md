## Contexto
Estou desenvolvendo uma aplicação Java para cadastro de usuários e preciso implementar medidas de segurança para o armazenamento de senhas. Atualmente tenho o seguinte método:

```java
public boolean registerUser(String email, String password) {
    // TODO: salvar no banco
    return true;
} 
```
Preciso de orientação sobre as melhores práticas de segurança para armazenamento de senhas. Por favor, me ajude com:

- Recomendações sobre quais técnicas/devem ser usadas para proteger as senhas (ex: hashing, salt, algoritmos recomendados)

- Exemplo prático de como implementar a segurança no método registerUser

- Considerações importantes sobre bibliotecas nativas do Java ou dependências recomendadas

- Parâmetros/configurações adequadas para o algoritmo escolhido (número de iterações, tamanho do salt, etc.)

- Boas práticas adicionais que devo considerar para segurança de autenticação

Gostaria que a resposta inclua código Java atualizado seguindo as melhores práticas atuais de segurança, com explicações sobre por que cada abordagem foi escolhida.