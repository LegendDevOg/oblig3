# oblig3

Dette repository inneholder løsningen for oblig 3, 
der GitHub Actions er satt opp for å kjøre tester
hver gang en commit pushes til repoet.
testene blir kjørt og i tillegg lagres de i en annen run step.

Jeg måtte lage en ny fil innad .github/workflows. Denne filen måtte inkludere noe test info som github laget for meg.

Deretter var det mye frem og tilbake av feiling og testing, men fant ut at jeg måtte inkludere et build script i pom'en min og endre på test.yml filen for å få alt til å fungere.
