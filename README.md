# Ideia geral do padrão DAO:
Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta entidade.

Por exemplo:
- Cliente: ClienteDao
- Produto: ProdutoDao
- Pedido: PedidoDao

Cada DAO será definido por uma interface.

A injeção de dependência pode ser feita por meio do padrão de projeto Factory

![image](https://user-images.githubusercontent.com/65719821/152716341-524a8709-949d-4c90-a5a4-0e9a0e09836c.png)

:trollface:
