**Ejercicio4**

*En este ejercicio compararemos el HashSet, TreeSet y LinkedHashSet.*

Después de ejecutar el programa ComparadorSet, responde a las siguientes preguntas:

  - ¿Qué diferencias observas en el orden de los elementos de cada Set?
    La principal es el tiempo ya que el HashSet es el más rápido con 0,010437 s mientras que el TreeSet es el más lento con 0,035834 s siendo el LinkedHashSet el intermedio con 0,010938 s.
    Otro elemento a destacar es la ordenación siendo la del TreeSet en orden alfabético, la del LinkedHashSet la salida de los datos tal cual fueron intruducidos y el HashSet el orden es aleatorio.

  - ¿Por qué crees que el TreeSet ordena los elementos alfabéticamente?
    Por el abaecedario, evidentemente, ya que en el afabeto latino/romance se empieza por la y a raíz de hay TreeSet busca las primeras letras más cercanas a esa y en el caso de que coincida las segunda y viceversa.

  - ¿Qué Set elimina los elementos duplicados? Todos los Set los elimina.
  -  ¿Por qué ocurre esto? Para obetener una mejor eficiencia al ejecutar el código y unicidad.
       
  - ¿Cuál es el Set más rápido para insertar elementos? Basándote en los resultados. El LinkedHashSet.
  - ¿Por qué crees que es así? Es así ya que trada casí el mismo tiempo que el HashSet y a su vez están ordenados en función de su salida.

Investiga y responde a las siguientes cuestiones:

  - Enumera las principales ventajas y desventajas de cada implementación de Set (HashSet, TreeSet y LinkedHashSet).
    1. HashSet.
         Ventajas: Rendimiento rápido y no garantiza el orden (en caso de que no se requiera un orden)
         Desventajas: Orden no garantizado y dependencia de hashCode() y equals()
    2. TreeSet.
         Ventajas: Ordenado, operaciones de búsqueda eficientes e ideal para operaciones que requieren orden.
         Desventajas: Rendimiento lento y no permite Null.
    3. LinkedHashSet.
         Ventajas: Mantinene el orden de inserción, Rendimiento similar al HashSet.
         Desventajas: Rendimiento levemente lento y mayor consumo de memoria.
       
  - Describe al menos dos situaciones prácticas en las que sería más apropiado usar cada tipo de Set. Justifica tu respuesta.
    1. HashSet
        Situación 1: Verificación de elementos únicos en una lista de usuarios
        Descripción: Imagina que tienes un sistema de registro de usuarios, donde recibes múltiples registros de usuarios y necesitas verificar si un usuario ya se ha registrado antes.
        Justificación: Usar un HashSet es ideal en este caso, ya que te permite verificar de manera eficiente si un usuario ya existe en el sistema. Las operaciones de adición y búsqueda son O(1) en promedio,
        lo que permite una verificación rápida sin necesidad de mantener el orden de los usuarios. No importa en qué orden se reciban los usuarios, solo te interesa la unicidad.

        Situación 2: Filtrado de elementos duplicados en una colección de datos
        Descripción: Supón que tienes una lista de valores numéricos o de cadenas que pueden contener duplicados y necesitas eliminar esos duplicados de manera eficiente.
        Justificación: Al usar un HashSet, los duplicados se eliminan automáticamente porque el Set asegura que los elementos sean únicos.
        Además, el rendimiento es excelente para este tipo de tarea, ya que la adición y búsqueda de elementos en un HashSet es muy rápida, lo que facilita el proceso de filtrado de duplicados en grandes colecciones de datos.

  2. TreeSet
      Situación 1: Crear una lista de elementos ordenados (por ejemplo, en un sistema de puntuaciones)
      Descripción: Imagina que estás desarrollando un sistema de clasificación de jugadores en un videojuego.
      Quieres mantener las puntuaciones en orden ascendente (o descendente), y cada vez que un jugador obtiene una nueva puntuación, necesitas agregarla y mantener la lista ordenada.
      Justificación: Un TreeSet es perfecto aquí porque mantiene los elementos ordenados de acuerdo con su orden natural o un Comparator proporcionado.
      En este caso, las puntuaciones de los jugadores estarán ordenadas en todo momento, lo que facilita la visualización del ranking de manera eficiente.
      Aunque el rendimiento de adición es O(log n), el orden garantizado hace que sea la elección más adecuada para este tipo de situación.

      Situación 2: Gestión de intervalos o rangos
      Descripción: Supón que estás trabajando con un sistema que maneja rangos de fechas o números, y necesitas asegurarte de que los rangos estén siempre ordenados, sin solaparse, y de que se puedan realizar búsquedas eficientes dentro de los rangos.
      Justificación: Un TreeSet puede ayudarte a almacenar y mantener los intervalos de forma ordenada, lo que permite realizar operaciones como verificar si un nuevo intervalo se superpone con otros de manera eficiente.
      Las búsquedas y adiciones a un TreeSet se realizan en O(log n), lo que es adecuado para manejar este tipo de operaciones de búsqueda en intervalos ordenados.
  
  3. LinkedHashSet
      Situación 1: Registro de visitas a un sitio web (mantener el orden de las visitas)
      Descripción: Imagina que tienes un sistema que registra las visitas a una página web y quieres mantener un registro de las URLs visitadas, pero también deseas que el orden de las visitas se conserve tal como ocurrieron.
      Justificación: Un LinkedHashSet es perfecto para este caso porque garantiza que los elementos estén en el orden en que se insertaron, lo cual es importante si quieres ver la secuencia exacta de visitas.
      Al mismo tiempo, asegura que no haya duplicados de URLs, y las operaciones de búsqueda y adición son eficientes (en promedio O(1)).

      Situación 2: Manejo de configuraciones o preferencias de usuario
      Descripción: Supón que estás desarrollando una aplicación donde los usuarios pueden configurar ciertas opciones, como preferencias de visualización, notificaciones, etc.
      Las opciones de configuración deben mantenerse en el orden en que el usuario las seleccionó, y no debe haber duplicados en las preferencias.
      Justificación: Un LinkedHashSet es ideal porque preserva el orden en que el usuario realiza las selecciones y al mismo tiempo asegura que no haya preferencias repetidas.
      Además, como las operaciones de inserción y búsqueda son O(1) en promedio, la eficiencia no se ve comprometida incluso cuando hay muchas configuraciones o preferencias.

     
