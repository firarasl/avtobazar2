package az.autobazar.domain.admin;

import java.math.BigDecimal;
import java.util.Date;

public class AutoAdmin {
    private Long id;
    private Date create_date;
    private Date activation_date;
    private Date last_update;
    private int vip;
    private int premium;
    private Model model;
    private Brand brand;
    private Generation_detail generation_detail;
    private int year;
    private Color color;
    private String vin;
    private Auto_Type auto_type;
    private BigDecimal engine;
    private int power_horse;
    private int getPower_kw;
    private Fuel_Type fuel_type;
    private int mileage;
    private int used;
    private Gear_Type gear_type;
    private int drive_type;
    private BigDecimal price;
    private Currency currency;
    private City city;
    private int seat;
    private int door;
    private Climatization climatization;
    private Country country;
    private int auto_pilot;
    private Light_Type light_type;
    private Parking_Sensor parking_sensor;
    private Interior_Material interior_material;
    private Euro_Type euro_type;
    private BigDecimal consumption_city;
    private BigDecimal consumption_highway;
    private BigDecimal consumption_mixed;
    private int service_history;
    private int damaged;
    private int problem;
    private String problem_description;
    private int first_owner;
    private Main_Region main_region;
    private String description;
    private int abs;
    private int esp;
    private int alarm;
    private int sunroof;
    private int bluetooth;
    private int start_stop;

    public AutoAdmin(Long id, Date create_date, Date activation_date, Date last_update, int vip, int premium, Model model, Brand brand, Generation_detail generation_detail, int year, Color color, String vin, Auto_Type auto_type, BigDecimal engine, int power_horse, int getPower_kw, Fuel_Type fuel_type, int mileage, int used, Gear_Type gear_type, int drive_type, BigDecimal price, Currency currency, City city, int seat, int door, Climatization climatization, Country country, int auto_pilot, Light_Type light_type, Parking_Sensor parking_sensor, Interior_Material interior_material, Euro_Type euro_type, BigDecimal consumption_city, BigDecimal consumption_highway, BigDecimal consumption_mixed, int service_history, int damaged, int problem, String problem_description, int first_owner, Main_Region main_region, String description, int abs, int esp, int alarm, int sunroof, int bluetooth, int start_stop) {
        this.id = id;
        this.create_date = create_date;
        this.activation_date = activation_date;
        this.last_update = last_update;
        this.vip = vip;
        this.premium = premium;
        this.model = model;
        this.brand = brand;
        this.generation_detail = generation_detail;
        this.year = year;
        this.color = color;
        this.vin = vin;
        this.auto_type = auto_type;
        this.engine = engine;
        this.power_horse = power_horse;
        this.getPower_kw = getPower_kw;
        this.fuel_type = fuel_type;
        this.mileage = mileage;
        this.used = used;
        this.gear_type = gear_type;
        this.drive_type = drive_type;
        this.price = price;
        this.currency = currency;
        this.city = city;
        this.seat = seat;
        this.door = door;
        this.climatization = climatization;
        this.country = country;
        this.auto_pilot = auto_pilot;
        this.light_type = light_type;
        this.parking_sensor = parking_sensor;
        this.interior_material = interior_material;
        this.euro_type = euro_type;
        this.consumption_city = consumption_city;
        this.consumption_highway = consumption_highway;
        this.consumption_mixed = consumption_mixed;
        this.service_history = service_history;
        this.damaged = damaged;
        this.problem = problem;
        this.problem_description = problem_description;
        this.first_owner = first_owner;
        this.main_region = main_region;
        this.description = description;
        this.abs = abs;
        this.esp = esp;
        this.alarm = alarm;
        this.sunroof = sunroof;
        this.bluetooth = bluetooth;
        this.start_stop = start_stop;
    }

    public AutoAdmin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getActivation_date() {
        return activation_date;
    }

    public void setActivation_date(Date activation_date) {
        this.activation_date = activation_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Generation_detail getGeneration_detail() {
        return generation_detail;
    }

    public void setGeneration_detail(Generation_detail generation_detail) {
        this.generation_detail = generation_detail;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Auto_Type getAuto_type() {
        return auto_type;
    }

    public void setAuto_type(Auto_Type auto_type) {
        this.auto_type = auto_type;
    }

    public BigDecimal getEngine() {
        return engine;
    }

    public void setEngine(BigDecimal engine) {
        this.engine = engine;
    }

    public int getPower_horse() {
        return power_horse;
    }

    public void setPower_horse(int power_horse) {
        this.power_horse = power_horse;
    }

    public int getGetPower_kw() {
        return getPower_kw;
    }

    public void setGetPower_kw(int getPower_kw) {
        this.getPower_kw = getPower_kw;
    }

    public Fuel_Type getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(Fuel_Type fuel_type) {
        this.fuel_type = fuel_type;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public Gear_Type getGear_type() {
        return gear_type;
    }

    public void setGear_type(Gear_Type gear_type) {
        this.gear_type = gear_type;
    }

    public int getDrive_type() {
        return drive_type;
    }

    public void setDrive_type(int drive_type) {
        this.drive_type = drive_type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public Climatization getClimatization() {
        return climatization;
    }

    public void setClimatization(Climatization climatization) {
        this.climatization = climatization;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getAuto_pilot() {
        return auto_pilot;
    }

    public void setAuto_pilot(int auto_pilot) {
        this.auto_pilot = auto_pilot;
    }

    public Light_Type getLight_type() {
        return light_type;
    }

    public void setLight_type(Light_Type light_type) {
        this.light_type = light_type;
    }

    public Parking_Sensor getParking_sensor() {
        return parking_sensor;
    }

    public void setParking_sensor(Parking_Sensor parking_sensor) {
        this.parking_sensor = parking_sensor;
    }

    public Interior_Material getInterior_material() {
        return interior_material;
    }

    public void setInterior_material(Interior_Material interior_material) {
        this.interior_material = interior_material;
    }

    public Euro_Type getEuro_type() {
        return euro_type;
    }

    public void setEuro_type(Euro_Type euro_type) {
        this.euro_type = euro_type;
    }

    public BigDecimal getConsumption_city() {
        return consumption_city;
    }

    public void setConsumption_city(BigDecimal consumption_city) {
        this.consumption_city = consumption_city;
    }

    public BigDecimal getConsumption_highway() {
        return consumption_highway;
    }

    public void setConsumption_highway(BigDecimal consumption_highway) {
        this.consumption_highway = consumption_highway;
    }

    public BigDecimal getConsumption_mixed() {
        return consumption_mixed;
    }

    public void setConsumption_mixed(BigDecimal consumption_mixed) {
        this.consumption_mixed = consumption_mixed;
    }

    public int getService_history() {
        return service_history;
    }

    public void setService_history(int service_history) {
        this.service_history = service_history;
    }

    public int getDamaged() {
        return damaged;
    }

    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }

    public int getProblem() {
        return problem;
    }

    public void setProblem(int problem) {
        this.problem = problem;
    }

    public String getProblem_description() {
        return problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public int getFirst_owner() {
        return first_owner;
    }

    public void setFirst_owner(int first_owner) {
        this.first_owner = first_owner;
    }

    public Main_Region getMain_region() {
        return main_region;
    }

    public void setMain_region(Main_Region main_region) {
        this.main_region = main_region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAbs() {
        return abs;
    }

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public int getEsp() {
        return esp;
    }

    public void setEsp(int esp) {
        this.esp = esp;
    }

    public int getAlarm() {
        return alarm;
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }

    public int getSunroof() {
        return sunroof;
    }

    public void setSunroof(int sunroof) {
        this.sunroof = sunroof;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getStart_stop() {
        return start_stop;
    }

    public void setStart_stop(int start_stop) {
        this.start_stop = start_stop;
    }

    @Override
    public String toString() {
        return "AutoAdmin{" +
                "id=" + id +
                ", create_date=" + create_date +
                ", activation_date=" + activation_date +
                ", last_update=" + last_update +
                ", vip=" + vip +
                ", premium=" + premium +
                ", model=" + model +
                ", brand=" + brand +
                ", generation_detail=" + generation_detail +
                ", year=" + year +
                ", color=" + color +
                ", vin='" + vin + '\'' +
                ", auto_type=" + auto_type +
                ", engine=" + engine +
                ", power_horse=" + power_horse +
                ", getPower_kw=" + getPower_kw +
                ", fuel_type=" + fuel_type +
                ", mileage=" + mileage +
                ", used=" + used +
                ", gear_type=" + gear_type +
                ", drive_type=" + drive_type +
                ", price=" + price +
                ", currency=" + currency +
                ", city=" + city +
                ", seat=" + seat +
                ", door=" + door +
                ", climatization=" + climatization +
                ", country=" + country +
                ", auto_pilot=" + auto_pilot +
                ", light_type=" + light_type +
                ", parking_sensor=" + parking_sensor +
                ", interior_material=" + interior_material +
                ", euro_type=" + euro_type +
                ", consumption_city=" + consumption_city +
                ", consumption_highway=" + consumption_highway +
                ", consumption_mixed=" + consumption_mixed +
                ", service_history=" + service_history +
                ", damaged=" + damaged +
                ", problem=" + problem +
                ", problem_description='" + problem_description + '\'' +
                ", first_owner=" + first_owner +
                ", main_region=" + main_region +
                ", description='" + description + '\'' +
                ", abs=" + abs +
                ", esp=" + esp +
                ", alarm=" + alarm +
                ", sunroof=" + sunroof +
                ", bluetooth=" + bluetooth +
                ", start_stop=" + start_stop +
                '}';
    }
}
