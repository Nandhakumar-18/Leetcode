class Solution {
    public String reformatDate(String date) {
        String[] arr = date.split(" ");

        Map<String, String> months = Map.ofEntries(
            Map.entry("Jan", "01"),
            Map.entry("Feb", "02"),
            Map.entry("Mar", "03"),
            Map.entry("Apr", "04"),
            Map.entry("May", "05"),
            Map.entry("Jun", "06"),
            Map.entry("Jul", "07"),
            Map.entry("Aug", "08"),
            Map.entry("Sep", "09"),
            Map.entry("Oct", "10"),
            Map.entry("Nov", "11"),
            Map.entry("Dec", "12")
        );

        String day = String.format("%02d",
                Integer.parseInt(arr[0].replaceAll("[a-zA-Z]", "")));

        return arr[2] + "-" + months.get(arr[1]) + "-" + day;
    }
}