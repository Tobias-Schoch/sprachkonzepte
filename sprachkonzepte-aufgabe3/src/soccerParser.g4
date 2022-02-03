parser grammar soccerParser;
options {
	tokenVocab = soccerLexer;
}
start: game EOF;

game: club score COLON score club;

club: CLUB;

score: NUMBER;