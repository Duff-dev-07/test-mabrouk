Feature: Page d'accueil Mabrouk

    Scenario: verification des menus de la page d'accueil

        Given utlisateur est sur la page d'accueil 
        When utilisateur survole le menu "Femme" puis clique sur le sous menu "Chemises & Blouses"
        Then la page "Chemises & Blouses" est affiche 




