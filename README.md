# Ideia geral do padrão DAO:
Para cada entidade um objeto responsável por fazer acesso aos dados relacionados.

- Cliente: ClienteDao
- Produto: ProdutoDao
- Pedido: PedidoDao

Cada DAO definido por uma interface.

A injeção de dependência pode ser feita por meio do padrão de projeto Factory

![image](https://user-images.githubusercontent.com/65719821/152716341-524a8709-949d-4c90-a5a4-0e9a0e09836c.png)

