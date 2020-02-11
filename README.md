# Chess-java
 by JAVA
![chess](https://github.com/hansnam1105/Chess-java/blob/master/example/chess.jpg)


Done with my colleagues 
K.S.Y / L.E.S / J.H.W / H.S.N

For specific information **RECOMMEND** to read [Chess Project Return.pdf](https://github.com/hansnam1105/Chess-java/blob/master/Chess%20Project%20Return.pdf)

## 목적
 이 프로젝트의 목적은 체스 게임을 자바로 구현하는 것이다. 1대1 체스 게임 뿐만 아니라 2대2 체스 게임까지 구현해서 4명까지 체스 게임에 참여 할 수 있게 한다. 

## 룰 
:blue_book: 1대1의 경우<br>
 체크메이트나 스테일메이트가 발생한 경우 각각에 맞는 창을 띄우고 필요한 경우 게임을 종료시키고 메인화면으로 돌아간다.
 ![1vs1](https://github.com/hansnam1105/Chess-java/blob/master/example/chess1vs1.png)![check1vs1](https://github.com/hansnam1105/Chess-java/blob/master/example/whitecheck.png)
 
:blue_book: 2대2의 경우<br>
어느 한 그룹(두 명)이 모두 전멸할 때까지 게임을 진행한다. 또한 체크메이트를 당한 색의 말들은  왕을 포함하여 판에서 모두 사라지고, 게임을 지속한다.
이어지는 상황에서 이미 사라진 사람의 턴일 때, 같은 그룹의 다른 사람의 턴으로 취급한다.
![2vs](https://github.com/hansnam1105/Chess-java/blob/master/example/chess2v2.png)![check2vs2](https://github.com/hansnam1105/Chess-java/blob/master/example/blackcheck.png)


## 개선할 점
 2 vs 2 체스 플레이 중 stalemate 상황일 때를 탐지하지 못한 것이 아쉬웠다.
앙파상, 캐슬링, 프로모션 등 체스의 일부 룰을 적용하지 못한 것이 아쉬웠다.
