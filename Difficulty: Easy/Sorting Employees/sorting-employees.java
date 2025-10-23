public class Solution {
    public List<String> sortRecords(List<String> employee, List<Integer> salary) {
        int n = employee.size();
        List<Record> list = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) list.add(new Record(employee.get(i), salary.get(i)));
        Collections.sort(list, new Comparator<Record>() {
            @Override
            public int compare(Record a, Record b) {
                if (a.salary != b.salary) return Integer.compare(a.salary, b.salary);
                return a.name.compareTo(b.name);
            }
        });
        List<String> res = new ArrayList<>(n);
        for (Record r : list) res.add(r.name);
        return res;
    }
    private static class Record {
        String name;
        int salary;
        Record(String name, int salary) { this.name = name; this.salary = salary; }
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        List<String> employee = Arrays.asList("chef", "geek");
        List<Integer> salary = Arrays.asList(100, 50);
        System.out.println(ob.sortRecords(employee, salary)); 
        employee = Arrays.asList("ram", "shyam", "rohan");
        salary = Arrays.asList(60, 45, 60);
        System.out.println(ob.sortRecords(employee, salary));
    }
}