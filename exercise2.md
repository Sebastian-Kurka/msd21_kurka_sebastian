#Exercise 2

## Liste von wichtigen GIT-Befehlen 

+ ### git config 
   + hiermit kann man seine git-Benutzerdaten einsehen und bearbeiten (Benutzername, E-Mail Adresse,...)
   + mit ```git config --global user.name``` kann man sich seinen Nutzernamen anzeigen lassen.
   + mit ```git config --global user.email "adress@example.com"``` legt man adress.example.com als seine 
     E-Mailadresse fest.

+ ### git init
  + ist ein einmaliger Befehl während der Ersteinrichtung eines neuen Repositorys. Durch das Ausführen dieses 
    Befehls wird ein neues . git -Unterverzeichnis in deinem aktuellen Arbeitsverzeichnis erstellt.

+ ### git commit
  + mit ```git commit -m "Kurzbeschreibung"``` kann man einen commit einschlieslich einer Kurzbeschreibung 
    der Änderungen vornehmen

+ ### git status 
  + zeigt den Status aller files im lokalen Reposetory an. (ob neu, bearbeitet oder untracked) 

+ ### git add
   + ```git add file_name``` fügt die Datei "file_name" zur staging Area hinzu

+ ### git log
  + hiermit kann man den Verlauf einsehen. Wer hat wann was geaddet, comitted oder gepusht,...

+ ### git diff
  + mit git diff kann man sich die Unterschiede (Differenzen) zwischen der Aktuellen und der bearbeiteten 
    Version eines Files anzeigen lassen.

+ ### git pull
  + mit ```git pull``` kann man sich Dateien vom Reposetory auf seinen Rechner "ziehen"/ herunterladen.

+ ### git push
  + mit ```git push``` fügt man alle Datein auf der Staging-Area zum Reposetory hinzu
