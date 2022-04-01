# Musik spelare
## Gruppmedlemmar
Uppgiften har gjorts av Ben Bergenwall, William Flythström, Lucas Kujala

## Hur vi löste uppgiften
Vi började med att tillsammans skriva koden. Efter det började Ben skriva in kommentarer
och under tiden började William och Lucas jobba på diagrammet och beskrivningen om hur
vi löst uppgiften.
Efter att vi sökt en stund hittade vi en plugin som automatiskt skapade ett UML diagram av
koden. Efter en hel del troubleshooting fick vi pluginet att fungera och kom fram till att det
skulle gått mycket snabbare om vi bara gjort diagrammet manuellt.
Till slut skapade vi tillsammans några enhetstest för domän lagret.

## Teknisk info om implementationen
Vi implementerade album klassen genom att använda listor för dess subalbum och sånger, eftersom det verkade vettigt. Detta betydde det att var väldigt lätt att implementera alla metoder eftersom de redan är implmenterade i List interfacen.
