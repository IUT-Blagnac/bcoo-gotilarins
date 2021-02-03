@startuml
class Point{
  float x;
  float y;
}
class Ligne{
	Point a;
	Point b;
}
Ligne "0..*" -- "2" Point
@enduml
