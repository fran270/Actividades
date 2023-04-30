// Lampara inteligente con Arduino
#define RELE_PIN      2
#define TRIGGER_PIN   5
#define ECHO_PIN      6

#define SOUND_SPEED   34300.0 // velocidad del sonido en cm/s
#define TIME_TO_WHAIT 3000    // en milisegundos

unsigned long time_for_off; // valor de millis en el que se debe apagar la lampara
float distance;

void setup() {
  // Configurar pines
  pinMode( RELE_PIN, OUTPUT );
  pinMode( TRIGGER_PIN, OUTPUT );
  pinMode( ECHO_PIN, INPUT );
  
  analogRead(A0);
  digitalWrite(RELE_PIN, LOW); // apagar lampara

  digitalWrite(TRIGGER_PIN, LOW);
  
}

void loop() {
  // put your main code here, to run repeatedly:

  distance = obtenerDistancia();

  if( distance < 35 ){
    digitalWrite(RELE_PIN, HIGH);
    time_for_off = millis() + TIME_TO_WHAIT;
  }
  
  if( time_for_off <= millis() )
    digitalWrite(RELE_PIN, LOW);
}


float obtenerDistancia(){

  // Poner Triger en estado bajo y esperar 2 ms
  digitalWrite(TRIGGER_PIN, LOW);
  delayMicroseconds(2);

  // Poner Trigger en alto y esperamos 10 ms
  digitalWrite(TRIGGER_PIN, HIGH);
  delayMicroseconds(10);

  // Comienza poniendo el pin Trigger en estado bajo nuevamente
  digitalWrite(TRIGGER_PIN, LOW);
  
  // tiempo de ida y vuelta de la sennal.
  unsigned long travel_time = pulseIn(ECHO_PIN, HIGH);

  float distancia = travel_time * SOUND_SPEED / 1000000.0 / 2.0;

  return distancia;  
}
