sum_list([], 0).
sum_list([H|T], SUM) :-
   	sum_list(T, REST),
SUM is H + REST.
