# feltex-pix



# Vídeo no youtube

Assista o vídeo no youtube


https://youtu.be/a_iYh_LnVF8


# Sistema de Gerenciamento de Chaves PIX com Geração de QR Code

Este projeto é uma aplicação desenvolvida em **Java** utilizando o framework **Spring Boot**, com o objetivo de expor uma API REST para a criação e gerenciamento de chaves PIX, além de gerar QR Codes de pagamento. A aplicação segue as melhores práticas de arquitetura de microsserviços e está preparada para integrações futuras com sistemas bancários.

## Funcionalidades Principais

1. **Criação de Chave PIX**: A API permite o registro de uma nova chave PIX com chave aleatória associada a uma conta de usuário.

2. **Listagem de Chaves PIX**: Permite a consulta das chaves PIX cadastradas para um determinado usuário.

3. **Deleção de Chaves PIX**: Permite deletar chaves PIX cadastradas para um determinado usuário.

4. **Geração de QR Code**: Cria QR Codes compatíveis com o padrão PIX para facilitar pagamentos. A API aceita parâmetros como valor, descrição e chave PIX para a criação dinâmica do QR Code.

## Tecnologias Utilizadas

- **Java 21**: Linguagem principal do projeto.
- **Spring Boot**: Framework utilizado para facilitar a criação de aplicações Java com configuração mínima.
- **Biblioteca de Geração de QR Code**: Para criar imagens de QR Code com base nos dados do pagamento.

---

Este projeto visa ser uma solução escalável e segura para o gerenciamento de chaves PIX, permitindo que sistemas financeiros
ou aplicativos possam se integrar de forma simples e eficiente.

---


### Links

Documentação da API: https://dev.efipay.com.br/

Exemplos: https://dev.efipay.com.br/docs/sdk/java

QrCode: https://pix.sejaefi.com.br/cob/pagar/2308764ac0034259ae8a7094ccbc0402

