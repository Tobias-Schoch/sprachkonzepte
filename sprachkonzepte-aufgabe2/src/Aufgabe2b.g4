grammar Aufgabe2b;

timeFormat : hours COLON minutes SPACE daytime | '12' SPACE MIDNIGHTNOON;

hours : HOURS;
minutes : MINUTES;
daytime : DAYTIME;

HOURS : ('0'[1-9] | '1'[0-2]);
MINUTES : ([0-5][0-9]);
MIDNIGHTNOON: ('noon' | 'midnight');
DAYTIME : ('a.m.' | 'p.m.');
COLON: (':');
SPACE: (' ');