package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AiredTime {
    @SerializedName("from")
    @Expose
    public String fromStringFormat;
    @SerializedName("to")
    @Expose
    public String toStringFormat;
    @SerializedName("prop")
    @Expose
    public Prop prop;
    @SerializedName("string")
    @Expose
    public String stringFormat;

    public AiredTime(String from, String to, Prop prop, String stringFormat) {
        this.fromStringFormat = from;
        this.toStringFormat = to;
        this.prop = prop;
        this.stringFormat = stringFormat;
    }


    /*
     * Prop type
     * */
    public class Prop {
        @SerializedName("from")
        @Expose
        public DateType from;
        @SerializedName("to")
        @Expose
        public DateType to;

        public Prop(DateType from, DateType to) {
            this.from = from;
            this.to = to;
        }

        public DateType getFrom() {
            return from;
        }

        public DateType getTo() {
            return to;
        }

        /*
        * Datetime type
        * */
        public class DateType {
            @SerializedName("day")
            @Expose
            public int day;
            @SerializedName("month")
            @Expose
            public int month;
            @SerializedName("year")
            @Expose
            public int year;

            public DateType(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }

            public int getDay() {
                return day;
            }

            public int getMonth() {
                return month;
            }

            public int getYear() {
                return year;
            }
        }
    }
}
