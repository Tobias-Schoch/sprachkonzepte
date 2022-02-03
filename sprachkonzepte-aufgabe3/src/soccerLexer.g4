lexer grammar soccerLexer;

COLON: ' : ';

CLUB:
	'FC Augsburg'
	| '1 FC Union Berlin'
	| 'Hertha BSC'
	| 'Arminia Bielefeld'
	| 'VfL Bochum'
	| 'Borussia Dortmund'
	| 'Eintracht Frankfurt'
	| 'SC Freiburg'
	| 'SpVgg Greuther Fuerth'
	| 'TSG 1899 Hoffenheim'
	| '1 FC Koeln'
	| 'RB Leipzig'
	| 'Bayer 04 Leverkusen'
	| '1 FSV Mainz 05'
	| 'Borussia Moenchengladbach'
	| 'FC Bayern Muenchen'
	| 'VfB Stuttgart'
	| 'VfL Wolfsburg';

NUMBER: ([0-9])+;

WS: [ \t\r\n]+ -> channel(HIDDEN);