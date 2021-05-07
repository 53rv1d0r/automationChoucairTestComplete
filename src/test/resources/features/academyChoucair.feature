# Autor: Manuel Alejandro Restrepo 71763120 3 de Mayo 2021
  @stories
  Feature: Academy Choucair
    As a user i want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for automation course
      Given than Alejandro wants to learn automation at the Academy Choucair
      | strUser   | strPassword  |
      | TuUsuario | TuClave      |
      When he search for the course on the Choucair Academy platform
      | strCourse                           |
      | Recursos Automatización Bancolombia |
      Then he finds the course called
      | strCourse                           |
      | Recursos Automatización Bancolombia |
