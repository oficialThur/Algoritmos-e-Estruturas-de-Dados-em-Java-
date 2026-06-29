# Vetor e Matriz 
___

" Vetor e matriz são termos em portugues utilizados para separar o que,em ingles, é conhecido como **Array** ". 
Um **Array** pode ser unidimensional(**vetor**) e multidimensional(**matriz**), e usado quando a quantidade de dados a
serem armazenados e consideravelmente pequena, essa estrutura posibilita apenas o mesmo tipo de dado.
Embora elas apresentem essas diferenças em relação à quantidade de dimensões exitem algumas caracteristicas comuns de
vetores e matrizes. 

### **Caracteristicas Comuns**
- Vetores e Matrizes tem o seu tamanho limitado e que definido no momento da sua criação e não poderar ser modificado
- Elas são sequencias, isso indica que os elementos armazenados vem um após o outro
    - Sempre acessamos os elementos atraves das suas posições dentro da estrutura.
  - Para acessar um elemento, não é necessario passar pelos seus antecessores.
- homogêneo, isso indica que as estruturas so podem ser de um unico tipo de dado.
___
### **Vetores**
O vetor pode ser visto como a repesentação mais convencional de um **Array**, os elementos estão dispostos em um unico 
sentido - por exemplo, na horizontal. Em vetor e composto por Elemento ou dado que está armazenado, tamanho ou a 
capacidade total de elementos que pode armazenar, indice ou o número de uma da posição limitado ou tamanho que o vetor 
possui

### **Como declarar um vetor em Java** 
```java
int[] vetor = new int[10]; || int[] vetor = {1, 2, 3};
``` 
Observe que primeiro declaro o tipo de dado, depois o nome do meu vetor e depois como já mencionado defino o seu tamanho. 
___
### **Matrizes** 
Diferente de um vetor o matriz e multidimencional oque significa que é uma estrutura onde os elementos estão dispostos 
em vários sentidos, a matriz pode ter diverços tamanhos como 3x3 o indice são combinações, que vão variando de acordo 
com a suas dimenções, por exemplo,```[0][0],[0][1],[0][2] | [1][0],[1][1],[1][2] | [2][0],[2][1],[2][2]```
. No conseito de memória, expecificamente stack elas são crias como vetores dentro de vetores.

### **Como declarar uma matriz em Java**
```java
int[][] matriz = new int[3][3]; || int[][] matriz = {{1, 2},{3, 4}};
``` 
Observe que primeiro declaro o tipo de dado, depois o nome da minha matriz e depois como já mencionado defino o seu tamanho.

___
### Agora siga os exemplos de código presente em <u>/vetores_matrizes</u>  