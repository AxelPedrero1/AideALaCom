 ## 1) Cas d'utilisation :

Malentendant :
C’est l’utilisateur principal du système. Il souhaite :
- Voir la transcription des paroles.
- Recevoir des alertes pour des événements spécifiques (bruit ambiant ou appel).
  
Orateur (acteur secondaire) :
C’est une personne qui parle et dont le discours est transcrit. Il interagit indirectement avec le système, mais son rôle est essentiel pour déclencher la transcription.

Le malentendant a besoin de suivre la conversation en cours. Ce besoin est représenté par le cas d’utilisation "Voir la transcription".
Ce cas est directement lié au cas "Transcrire orateur", car sans transcription des paroles, il n’y a rien à afficher.
Une relation « include » est utilisée. Cela signifie que le cas "Voir la transcription" inclut obligatoirement le cas "Transcrire orateur".

Le malentendant doit être informé lorsqu’un événement particulier se produit, comme un bruit ambiant (alarme, signal) ou un appel de nom. Ce besoin est représenté par le cas d’utilisation "Être alerté".
Une relation « extends » est utilisée entre "Être alerté" et "Bruit ambiant + appel nom".
Pourquoi "extends" ?
Le cas "Bruit ambiant + appel nom" est une extension de "Être alerté". Cela signifie que ce cas est optionnel et représente une situation plus spécifique dans laquelle un bruit particulier (comme une alarme ou un appel) déclenche l’alerte.

## 2) Séquence : 

Orateur : Il initie le processus en parlant, ce qui génère un signal sonore capté par le micro.

Micro : Il transmet le signal sonore au logiciel, servant d’interface entre l’orateur et la technologie.

Logiciel : Il analyse le signal et exécute deux tâches distinctes grâce à une condition alt :

- Si quelqu'un parle, le logiciel effectue une transcription des paroles pour l'afficher au malentendant.
- Si un bruit ambiant spécifique (comme une alarme) est détecté, une alerte visuelle est envoyée au malentendant.
  
Le malentendant reçoit les informations via transcription ou alerte selon le contexte.

Chaque colonne correspond à un acteur ou un composant (ex. Orateur, Micro, Logiciel, Malentendant).
La ligne verticale sous chaque acteur est appelée ligne de vie : elle montre que l'objet existe durant toute la séquence.

## 3) Etats-transitions :

## 4) Classe :

Classes :
UserInterface : Classe centrale qui coordonne la transcription, les alertes, et les notifications sonores pour l'utilisateur.
TranscriptionModule : Convertit l'audio en texte, utilisé par UserInterface pour afficher des transcriptions.
AlertModule : Gère les alertes visuelles pour informer l'utilisateur, intégré dans UserInterface.
SoundDetectionModule : Détecte les bruits spécifiques et interagit temporairement avec UserInterface.

Agrégations :
UserInterface utilise TranscriptionModule et AlertModule comme composants permanents (1 à plusieurs instances possibles).

Dépendance :
UserInterface dépend temporairement de SoundDetectionModule (0 à 1 interaction avec 1 ou plusieurs modules).

## 5) Activité :
