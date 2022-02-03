grammar Aufgabe2b;

timeFormat : hours COLON minutes SPACE daytime;

hours : HOURS;
minutes : MINUTES;
daytime : CHAR;

HOURS : ('0'[1-9] | '1'[0-2]);
MINUTES : ([0-5][0-9]);
CHAR :('midnight' | 'noon' | 'a.m.' | 'p.m.');
COLON: (':');
SPACE: (' ');