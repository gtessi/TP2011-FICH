conectado(a,b).
conectado(a,d).
conectado(b,c).
conectado(c,g).
conectado(d,f).
conectado(f,e).
conectado(f,g).
conectado(g,salida).

conectado_a(X,Y):- conectado(Y,X); conectado(X,Y).

pertenece(X,[X|_]):- !.
pertenece(X,[_|C]):- pertenece(X,C).

concatenar([],L2,L2):- !.
concatenar([X|C],L2,[X|L]):- concatenar(C,L2,L).

invertir([],[]).
invertir([X|C],L):- invertir(C,R), concatenar(R,[X],L).

camino(salida,L,L):- !.
camino(X,YaRecorrido,Lr):- conectado_a(X,Y), not(pertenece(Y,YaRecorrido)), camino(Y,[Y|YaRecorrido],Lr).
salida(X,Lr):- camino(X,[X],L), invertir(L,Lr).