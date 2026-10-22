Feature: Page Chemises & Blouses

    Scenario: verification page produits

        Given utlisateur est sur la page Chemises & Blouses 
        When utilisateur clique sur le produit "CHEMISE À COL CLASSIQUE AVEC DÉTAILS EN STRASS"
        Then la page du produit "CHEMISE À COL CLASSIQUE AVEC DÉTAILS EN STRASS" est affiche 


