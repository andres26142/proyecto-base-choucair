#Autor: Julian Hernandez
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screeplay at the Choucair Academy with the automation Course
  @scenario1:
  Scenario Outline: Search for a automation course
    Given that julian wants to learn automation at the academy Choucair
    | strUser | strPassword |
    | <strUser> | <strPassword>     |
    When he searches for the course on the Choucair academy platform
    | strCourse   |
    | <strCourse> |
    Then he finds the course called
    | strCourse    |
    | <strCourse>  |
    Examples:
     | strUser | strPassword | strCourse |
     | 1122143074| Choucair2021*| Workshop de Automatización|