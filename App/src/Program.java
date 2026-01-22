import java.util.*;
import java.util.concurrent.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.stream.*;

public class Program {

    private static final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static final Map<String, Integer> mapa = Collections.unmodifiableMap(new HashMap<>());

    public static void main(String[] args) {

        try { String nulo = null; nulo.equals("erro1"); } 
        catch (Exception e) { e.printStackTrace(); }

        try { List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C")); for (String s : lista) if (s.equals("B")) lista.remove(s); } 
        catch (Exception e) { e.printStackTrace(); }

        try { mapa.put("x", 1); } 
        catch (Exception e) { e.printStackTrace(); }

        try { Object valor = "123"; Integer numero = (Integer) valor; } 
        catch (Exception e) { e.printStackTrace(); }

        try { Future<String> futuro = executor.submit(() -> { Thread.sleep(2000); return "ok"; }); futuro.get(1, TimeUnit.MILLISECONDS); } 
        catch (Exception e) { e.printStackTrace(); }

        try { int[] nums = new int[3]; for (int i = 0; i <= nums.length; i++) nums[i] = i; } 
        catch (Exception e) { e.printStackTrace(); }

        try { int zero = Integer.parseInt("0"); int crash = 10 / zero; } 
        catch (Exception e) { e.printStackTrace(); }

        try { Stream<String> stream = Stream.of("X","Y"); stream.forEach(System.out::println); stream.count(); } 
        catch (Exception e) { e.printStackTrace(); }

        try { executor.shutdown(); executor.submit(() -> System.out.println("rejeitado")); } 
        catch (Exception e) { e.printStackTrace(); }

        try { recursaoInfinita(); } 
        catch (StackOverflowError e) { e.printStackTrace(); }

        try { String invalido = "abc"; int num = Integer.parseInt(invalido); } 
        catch (Exception e) { e.printStackTrace(); }

        try { Class.forName("ClasseInexistente"); } 
        catch (Exception e) { e.printStackTrace(); }

        try { Optional<String> vazio = Optional.empty(); vazio.get(); } 
        catch (Exception e) { e.printStackTrace(); }

        try { Field field = Program.class.getDeclaredField("inexistente"); field.setAccessible(true); field.get(new Program()); } 
        catch (Exception e) { e.printStackTrace(); }

        try { File arquivo = new File("nao_existe.txt"); new Scanner(arquivo); } 
        catch (Exception e) { e.printStackTrace(); }

        try { String s = null; s.length(); } 
        catch (Exception e) { e.printStackTrace(); }

        try { List<String> lista2 = Collections.unmodifiableList(new ArrayList<>()); lista2.add("erro"); } 
        catch (Exception e) { e.printStackTrace(); }

        try { Field f = String.class.getDeclaredField("value"); f.setAccessible(true); f.set("abc", null); } 
        catch (Exception e) { e.printStackTrace(); }

        try { Object obj = new Object(); Method m = Program.class.getDeclaredMethod("main", String[].class); m.invoke(obj, (Object) new S; }
        catch (Exception e) {e.printStackTrace(); }