Feature: Ingreso de nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresa Username "user" y Password "user"
Then inicia sesion
