PREGUNTA 1

Explica cómo funciona la relación 1:N entre Agencia y Satelite tanto en SQL como en Java.

La relación 1:N indica que una agencia puede tener varios satelites, por ende en sql o en java con un join eres capaz de ver a que agencia pertenece explicitamente cada satelite y más de un satelite pueden pertenecer a la misma agencia pero un satelite no puede pertenecer a 2 agencias al mismo tiempo.


PREGUNTA 2

Explica por qué en Java utilizamos:

private Agencia agencia;

y no:

private int agenciaId;


Pues debido a que si lo guardas como int agenciaId, se pueden malversar los datos ya que puedes colocar un id que no le pertenezca a ninguna agencia mientras que con Agencia agencia tienes que colocar un id de una agencia que exista por lo cual no puede ser inventado.


PREGUNTA 3

Explica qué ventaja aporta PreparedStatement frente a concatenar SQL manualmente.

Pues una vez que tienes hecho el PreparedStatement lo puedes reutilizar y asi no tienes que concatenar todas las veces a mano.