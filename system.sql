select * from emp;
select 10*20 from DUAL;           -- 200
select round(45.293,2)from dual;  -- 45.29
select round(45.293,-1)from dual; -- 50
select sal, MOD(sal, 100) from emp;-- mod 나누어 나머지
select * from emp where MOD(empno, 2) = 1;
select sum(sal) from emp;
select avg(sal) from emp;
select max(sal), min(sal) from emp;
select count(comm) from emp;
select count(comm) from emp where deptno=10;
select count(DISTINCT job) from emp;
select count(*) from emp;
select max(sal) ename from emp;
select deptno, ename, avg(sal) from emp group by deptno; -- Error
select deptno, avg(sal) from emp group by deptno having avg(sal) >=2000;
select deptno, count(sal) from emp where sal>=1000 group by deptno having count(sal)>=3;

select empno, ename, deptno from emp where empno=7900;
select dname from dept where deptno=30;

select * from emp, dept where emp.deptno=dept.deptno;
select ename, dname from emp, dept where emp.deptno =dept.deptno;
select e.ename, d.dname, e.deptno, d.deptno from emp e, dept d where e.deptno = d.deptno;
select ename, deptno from emp;
select deptno, dname from dept;
select emp.ename, dept.dname, emp.deptno from emp, dept where emp.deptno = dept.deptno and emp.ename='SMITH';
select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal >= s.losal and e.sal <= s.hisal;
select e.ename, d.dname,s.grade from emp e, dept d, salgrade s where e.deptno = d.deptno and e.sal between s.losal and s.hisal;
select ename, mgr from emp;
select e.ename || '의 매니저는'||m.ename || '입니다.'from emp e, emp m where e.mgr= m.empno;
select e.ename || '의 매니저는'||m.ename || '입니다.'from emp e, emp m where e.mgr = m.empno(+);
select e.ename, d.dname from emp e, dept d where e.deptno(+) = d.deptno;

select emp.ename, emp.comm, dept.dname, dept.loc from emp, dept where emp.deptno = dept.deptno and emp.comm IS NOT NULL and emp.comm NOT IN(0);
select dname from dept where deptno = (select deptno from emp where ename='JONES');
select ename, sal from emp where sal> ANY(select sal from emp where deptno = 30);
select ename, hiredate, deptno from emp where deptno IN ( select deptno from emp where ename = 'BLAKE' ) AND ename != 'BLAKE';
select ename, sal, deptno from emp where deptno IN ( select sal from emp where sal >= 3000);
select ename, sal from emp where sal > ALL (select sal from emp where deptno = 30);
select ename, sal from emp where sal >= ( select sal from emp where ename='SCOTT');
select deptno, dname, loc from dept where deptno IN (select deptno from emp where job='CLERK');





