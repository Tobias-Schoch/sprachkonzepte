fakultat(1, 1).
fakultat(X, Result) :- Y is X - 1,
fakultat(Y, NextResult), Result is NextResult * X.
