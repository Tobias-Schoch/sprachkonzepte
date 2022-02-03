lexer grammar soccerLexer;

COLON: ' : ';

CLUB:
	'FC Augsburg'
	| '1. FC Union Berlin'
	| 'Hertha BSC'
	| 'Arminia Bielefeld'
	| 'VfL Bochum'
	| 'Borussia Dortmund'
	| 'Eintracht Frankfurt'
	| 'SC Freiburg'
	| 'SpVgg Greuther Fürth'
	| 'TSG 1899 Hoffenheim'
	| '1. FC Köln'
	| 'RB Leipzig'
	| 'Bayer 04 Leverkusen'
	| '1. FSV Mainz 05'
	| 'Borussia Mönchengladbach'
	| 'FC Bayern München'
	| 'VfB Stuttgart'
	| 'VfL Wolfsburg';

NUMBER: ([0-9])+;

WS: [ \t\r\n]+ -> channel(HIDDEN);