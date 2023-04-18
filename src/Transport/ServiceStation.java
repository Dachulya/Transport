package Transport;


import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation {
    private Queue <Transport> transport=new LinkedList<>();


    public void addTransport(Transport transport){

        if (transport != null) {
            System.out.println("Введите автомобиль");
        }
        this.transport.offer(transport);
    }
    public  void  carryOutATechnicalInspection(){
        while (true) {
            if (transport.isEmpty())return;
            if (transport.element() instanceof Bus) {
                System.out.println(this.transport.poll().getModel() + " не может проходитьТО");
            } else {
                System.out.println(this.transport.poll().getModel() + " проходит ТО");
            }
        }
    }
    /*Е element() - возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, инициируется исключение NoSuchElementException.
Е remove() - удаляет элемент из головы очереди, возвращая его. Инициирует исключение NoSuchElementException, если очередь пуста.
Е peek() - возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.
Е роll() - возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.
boolean offer(Е оbj) - пытается добавить оbj в очередь. Возвращает true, если оbj добавлен, и false в противном случае.*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStation that = (ServiceStation) o;
        return Objects.equals(transport, that.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transport);
    }
}
