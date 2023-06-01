package cn.jsoncc.demo.nullpointexception;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.getCompanyFromEmployee();
    }

    public void getCompanyFromEmployee() {
        Employee employee = getEmployee();
        Company company = employee.getTeam().getDepartment().getCompany();
        System.out.println(company);
    }

    private Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeName("JiaGouWuDao");
        employee.setTeam(new Team("DevTeam4"));
        return employee;
    }
}

class Employee {
    private String employeeName;
    private Team team;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

class Team {
    private String teamName;
    private Department department;

    public Team(String teamName) {
        this.teamName = teamName;
        this.department = new Department("DevDepartment");
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

class Department {
    private String departmentName;
    private Company company;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.company = new Company("ABC Company");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

class Company {
    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
